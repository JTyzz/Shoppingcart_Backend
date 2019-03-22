INSERT INTO users (userid, billingaddress, email, fullname, password, phonenumber, role, shippingaddress, username)
VALUES (1, '52169 Macpherson Place', 'snewe0@biblegateway.com', 'Sibbie Newe', 'hBHgwOXU', '348-534-2218', 'USER', '0046 Londonderry Lane', 'snewe0'),
       (2, '35362 Main Court', 'tbamlett1@statcounter.com', 'Tiffanie Bamlett', 'Zt60fAoF2', '227-762-9546', 'USER', '497 Northport Avenue', 'tbamlett1'),
       (3, '0 Pepper Wood Pass', 'crappport2@pagesperso-orange.fr', 'Court Rappport', 'ZGEnHFQV', '484-136-9315', 'USER', '1771 Debra Lane', 'crappport2'),
       (4, '864 34th St', 'jtyzzer@gmail.com', 'Jason Tyzzer', '10Nt3ch!0', '805-290-2206', 'ADMIN', '864 34th St', 'jtyzzer');

INSERT INTO supplier(supplierid,suppliername,quantity)
VALUES (1, 'Big Foot', 400),
       (2, 'Grave Digger', 300),
       (3, 'Monster Trucks', 1000),
       (4, 'Mon-star Trucks', 700);

INSERT INTO product(productid, productname, description, price)
VALUES (1, 'Product 1', 'Yellow', 6.49),
       (2, 'Product 2', 'Red', 32.99),
       (3, 'Product 3', 'Rotund', 2.99),
       (4, 'Product 4', 'Black', 12.99),
       (5, 'Product 5', 'Square', 3.94),
       (6, 'Product 6', 'Orange', 2.39),
       (7, 'Product 7', 'Orangish', 10.99);


INSERT INTO orders(orderid, userid, productname, quantity, productid)
VALUES (1, 1,'Chapstick Moisturizing Lip Balm 3ct', 2, 3),
       (2, 3,'Pop Secret Premium Popcorn 30ct', 3, 4),
       (3, 2,'Purina One SmartBlend', 5, 2),
       (4, 3,'Kibbles n Bits', 8, 1);

INSERT INTO supplier_products(productid, supplierid)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4);