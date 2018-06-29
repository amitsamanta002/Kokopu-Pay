select * from emp_dept;
select * from emp_detail;

select a.deptid from emp_dept 'A' inner join emp_detail B
on A.deptid = B.empid;