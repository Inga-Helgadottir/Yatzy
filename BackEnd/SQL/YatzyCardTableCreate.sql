use yatzy;
CREATE TABLE `yatzycard` (
  `id` int NOT NULL,
  `ones` int DEFAULT NULL,
  `twoes` int DEFAULT NULL,
  `threes` int DEFAULT NULL,
  `fours` int DEFAULT NULL,
  `fives` int DEFAULT NULL,
  `sixes` int DEFAULT NULL,
  `PlayerId` int NOT NULL,
  PRIMARY KEY (`id`,`PlayerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
