DROP DATABASE accountdb;
create database accountdb;
use accountdb;

CREATE TABLE `ACCOUNT` (
	`CUSTOMERID` INT NOT NULL primary key,
	`SAVINGSNUMBER` BIGINT default null,
	`CURRENTNUMBER` BIGINT default null,
	`CREDITNUMBER` BIGINT default null,
	`LOAN_ID` BIGINT default null
	);
	
	
SELECT * FROM ACCOUNT;


insert into ACCOUNT values('63214578','126487956714','426486446756','2587984655','456520000032');
insert into ACCOUNT values('63298798','126487976541','426386446321','2587983226','456520000143');
insert into ACCOUNT values('63215479','126487955863','426386246943','2587985599','456520000645');
insert into ACCOUNT values('63265874','126487956756','426386246584','2587984025','456520000784');
insert into ACCOUNT values('63256786','126487956423','426386246213','2587984092','456520000615');

CREATE TABLE `savings` (
  `SAVINGS_ACCOUNT_NUMBER` bigint  NOT NULL ,
  `ACCOUNT_TYPE` varchar(25) NOT NULL,
  `AVAILABLE_BALANCE` double NOT NULL,
   `LAST_TRANSACTION_DATE` DATE NOT NULL,
    `INTEREST`  INT NOT NULL,
  PRIMARY KEY (`SAVINGS_ACCOUNT_NUMBER`)

) ;

SELECT * FROM SAVINGS;

insert into SAVINGS values('126487956423','Savings','6000','2020-08-19',3);
insert into SAVINGS values('126487956756','Savings','2900','2020-08-17',3);
insert into SAVINGS values('126487956714','Savings','3200','2020-08-15',3);
insert into SAVINGS values('126487976541','Savings','8078','2020-08-14',3);
insert into SAVINGS values('126487955863','Savings','5200','2020-08-19',3);



CREATE TABLE `current` (
  `CURRENT_ACCOUNT_NUMBER` bigint(12)  NOT NULL ,
 `ACCOUNT_TYPE` varchar(25) NOT NULL,
  `BEGINNINGBALANCE` double(11,4) NOT NULL,
  `AVAILABLEBALANCE` double(11,4) NOT NULL,
  `DUEAMOUNT` double(11,4)  NOT NULL,
  `PAYMENT_DUE_DATE` DATE NOT NULL,
  `OUTSTANDINGBALANCE` double(11,4) NOT NULL,
  PRIMARY KEY (`CURRENT_ACCOUNT_NUMBER`)
);

	

insert into CURRENT values('426486446756','current','4000','2900','150','2020-08-21','1100');
insert into CURRENT values('426386446321','current','4000','6500','560','2020-08-24','0');
insert into CURRENT values('426386246943','current','4000','2000','840','2020-08-23','2000');
insert into CURRENT values('426386246584','current','4000','3000','980','2020-08-23','1000');
insert into CURRENT values('426386246213','current','4000','1500','330','2020-08-23','3500');

SELECT * FROM current;



CREATE TABLE `credit` (
  `CREDIT_ACCOUNT_NUMBER` bigint  NOT NULL ,
  `ACCOUNT_TYPE` varchar(25) NOT NULL,  
  `AVAILABLE_BALANCE` double NOT NULL,
   `INTEREST`  FLOAT NOT NULL,
  `DUEAMOUNT` double(11,4)  NOT NULL,
   `PAYMENT_DUE_DATE` DATE NOT NULL,
  `OUTSTANDINGBALANCE` double(11,4) NOT NULL,
  PRIMARY KEY (`CREDIT_ACCOUNT_NUMBER`)
);



insert into CREDIT values('2587984655','credit','6050','13.7','1154','2020-08-23','4700');
insert into CREDIT values('2587983226','credit','8000','11.7','1879','2020-08-25','7200');
insert into CREDIT values('2587985599','credit','6000','13.7','2200','2020-08-27','4038');
insert into CREDIT values('2587984025','credit','7500','11.7','1750','2020-08-28','6056');
insert into CREDIT values('2587984092','credit','8400','11.7','2150','2020-08-28','7600');

		SELECT * FROM credit;



