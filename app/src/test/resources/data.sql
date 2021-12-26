INSERT INTO public.product(id, name) VALUES (1, 'car_test');
INSERT INTO public.product(id, name) VALUES (2, 'bike_test');

INSERT INTO public.sales_period(id, price, date_from, date_to, product) VALUES(1, 100, '2020-05-01', '2020-05-04', 1);
INSERT INTO public.sales_period(id, price, date_from, date_to, product) VALUES(2, 150, '2020-05-06', '2020-05-08', 1);
INSERT INTO public.sales_period(id, price, date_from, date_to, product) VALUES(3, 50, '2020-05-01', null, 2);
INSERT INTO public.sales_period(id, price, date_from, date_to, product) VALUES(4, 120, '2020-05-09', '2020-05-14', 2);
