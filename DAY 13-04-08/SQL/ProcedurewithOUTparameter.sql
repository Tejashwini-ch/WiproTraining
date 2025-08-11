delimiter //
create procedure disp_max(OUT highestprice integer)
                 begin
                 select max(price) into highestprice from book;
                 end; 
//
call disp_max(@Max);
select @Max;
