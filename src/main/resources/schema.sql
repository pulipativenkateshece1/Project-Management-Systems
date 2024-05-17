create table project
(
  id BIGINT  AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  descripttion VARCHAR(500) ,
  start_date DATE NOT NULL,
  end_date DATE NOT NULL
  
);