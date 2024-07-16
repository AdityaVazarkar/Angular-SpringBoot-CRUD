import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee.module';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  constructor(private httpClient: HttpClient) {}

  api = 'http://localhost:9091';

  public saveEmployee(employee: Employee): Observable<Employee> {
    return this.httpClient.post<Employee>(
      `${this.api}/save/employee`,
      employee
    );
  }

  public getEmployee(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(`${this.api}/get/employee`);
  }

  public deleteEmployee(employeeId: number) {
    return this.httpClient.delete<Employee>(
      `${this.api}/delete/employee/${employeeId}`
    );
  }

  public getEmployees(employeeId: number) {
    return this.httpClient.get<Employee>(
      `${this.api}/get/employee/${employeeId}`
    );
  }

  public updateEmployees(employee: Employee) {
    return this.httpClient.put<Employee>(`${this.api}/update/employee`,employee);
  }
}
