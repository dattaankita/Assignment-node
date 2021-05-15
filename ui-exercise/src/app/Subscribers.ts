export class Subscribers {
    data: String[];
    total: Number;
    highRisk: String;
    
    constructor(data: String[], highRisk: String, total: Number){
      this.data = data;
      this.highRisk = highRisk;
      this.total = total;
    }
  }