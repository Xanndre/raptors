import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Graph} from "../model/Graphs/Graph";
import {Stand} from "../model/Stand/Stand";

@Injectable({
  providedIn: 'root'
})

export class StandService {

  private readonly standURL: string;

  constructor(private http: HttpClient) {
    this.standURL = 'http://localhost:8080//movement/stands/';
  }

  public getStand(id: string): Observable<Stand> {
    const headers = {'Authorization': 'Basic ' + sessionStorage.getItem('token')};
    return this.http.get<Stand>(this.standURL + id, {headers: headers, responseType: 'json'})
  }

  public getAll(): Observable<Stand[]> {
    const headers = {'Authorization': 'Basic ' + sessionStorage.getItem('token')};
    return this.http.get<Stand[]>(this.standURL + "all", {headers: headers, responseType: 'json'})
  }

  public save(stand: Stand) {
    const headers = {'Authorization': 'Basic ' + sessionStorage.getItem('token')};
    return this.http.post<Stand>(this.standURL + 'add', stand, {headers: headers});
  }

  public delete(id: string) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Authorization': 'Basic ' + sessionStorage.getItem('token',)
      })
    };
    return this.http.delete(this.standURL + 'delete/'+id, httpOptions);
  }
}
