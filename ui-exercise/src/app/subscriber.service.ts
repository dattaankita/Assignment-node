import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { HttpResponse } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SubscriberService {

  getAllUri:string = `http://localhost:3000/subscribers`;

  getUri:string = `http://localhost:3000/subscribers/:{page}/:{size}`;

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Accept': 'text/html'
    })
  }  
  routerUrl="http://localhost:3000";

  constructor( private http: HttpClient ) {
  }
   
  getAllResponse(text: any): Observable<any> {
      return Observable.create((behaviorSubject: BehaviorSubject<any>) => {
      const requestData = {
        text:text
      };
      
      return this.http.get(this.getAllUri).subscribe(
        data => {
          behaviorSubject.next(data);
        }
      );
    });
}

getResponse(text: any): Observable<any> {
  return Observable.create((behaviorSubject: BehaviorSubject<any>) => {
  const requestData = {
    text:text
  };
 
  return this.http.get(this.getUri).subscribe(
    data => {
      behaviorSubject.next(data);
    }
  );
});
}
}