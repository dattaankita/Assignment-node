const mongoose = require('mongoose')

const subscriberSchema = new mongoose.Schema({
  data: {
    type: array,
    required: true
  },
  total: {
    type: Number,
    required: true
  },
  highRisk: {
    type: String,
    required: true,
  }
})

module.exports = mongoose.model('Subscriber', subscriberSchema)