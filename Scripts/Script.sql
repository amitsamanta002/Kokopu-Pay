select * from emp_dept deptid='MFT';
select * from emp_detail;


select deptname from emp_dept where deptid = 'MFT';

select a.deptid from emp_dept 'A' inner join emp_detail B
on A.deptid = B.empid;