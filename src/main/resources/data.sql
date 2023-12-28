INSERT INTO `barbers`
(`email`, `name`, `phone_number`)
VALUES
('log@gmail.com', 'Loganathan', '5141112222'),
('siva@gmail.com', 'Siva', '5141112222'),
('raja@gmail.com', 'Raja', '5141112222'),
('vishnu@gmail.com', 'Vishnu', '5141112222');

INSERT INTO `services`
(`duration`, `name`, `price`)
VALUES
(30, "Men's Haircut", 200),
(30, "Beard Trimming", 100),
(30, "Men's Colouration", 500),
(30, "Blow-dry / Brushing", 250),
(30, "Shave", 100);



INSERT INTO `service_provider`
(`service_id`, `barber_id`)
VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 1),
(2, 2),
(2, 3),
(3, 1),
(3, 2),
(4, 3),
(4, 4),
(5, 1),
(5, 3);