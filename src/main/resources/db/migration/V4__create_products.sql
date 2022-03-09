CREATE TABLE IF NOT EXISTS products(
 product_id SERIAL not null,
 product_category VARCHAR (100) not null ,
 product_name VARCHAR (100) not null,
 description VARCHAR (500) not null ,
 product_price decimal(5, 2)  not null,
 soft_delete int not null  default 0 ,
  CONSTRAINT fk_product_category
      FOREIGN KEY(product_category)
	  REFERENCES product_categories(category_name) ON DELETE SET NULL ON UPDATE CASCADE,
	  primary key(product_id)
);
