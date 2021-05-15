import { calculateLimitAndOffset, paginate } from 'paginate-info';

const express = require('express')
const router = express.Router()
const Subscriber = require('../models/subscriber')

router.get('/', async (req, res) => {
  try {
    const subscribers = await Subscriber.find()
    res.json(subscribers)
  } catch (err) {
    res.status(500).json({ message: err.message })
  }
})

router.get('/:page/:size', async(req, res) => {
    try{
        const subscribers = await Subscriber.find()
        const pageCount = Math.ceil(subscribers.length / size);
        let page = parseInt(req.query.p);
        if (!page) { page = 1;}
        if (page > pageCount) {
        page = pageCount
        }
        res.json({
        "page": page,
        "pageCount": pageCount,
        "subscribers": subscribers.slice(page * size - 10, page * size)
        })
    }catch(err){
        res.status(500).json({ message: err.message })
    }
})

module.exports = router