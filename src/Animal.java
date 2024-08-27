public class Animal {

        // Метод бега
        public void run(int distance) {
            System.out.println(" Животное бежит " + distance + " метров.");
        }

        // Метод для плавания
        public void swim(int distance) {
            System.out.println(" Животное плавает " + distance + " метров.");
        }
    }

    // Класс Cat, который наследует от Animal
    class Cat extends Animal {
        private static int catCount = 0; // Статическое поле для подсчета количества созданных кошек
        private boolean satiety; // Поле, показывающее, сыта ли кошка

        // Конструктор класса Cat
        public Cat() {
            catCount++; // Увеличиваем счетчик кошек при создании нового объекта
            this.satiety = false; // Изначально кошка не сыта
        }

        // Переопределение метода run для кошки
        @Override
        public void run(int distance) {
            if (distance <= 200) {
                System.out.println(" Кошка бежит " + distance + " метров.");
            } else {
                System.out.println(" Кошка не может пробежать больше 200 метров.");
            }
        }

        // Переопределение метода swim для кошки
        @Override
        public void swim(int distance) {
            System.out.println("Кошка не умеет плавать.");
        }

        // Метод для кормления кошки
        public void eat(Bowl bowl, int amount) {
            if (amount > bowl.getFood()) {
                System.out.println("В миске недостаточно еды.");
            } else {
                bowl.decreaseFood(amount); // Уменьшаем количество еды в миске
                this.satiety = true; // Кошка становится сытой
                System.out.println("Кошка съела " + amount + " единиц пищи.");
            }
        }

        // Метод для проверки, сыта ли кошка
        public boolean isSatiety() {
            return satiety;
        }

        // Статический метод для получения общего количества кошек
        public static int getCatCount() {
            return catCount;
        }
    }

    // Класс Dog, который наследует от Animal
    class Dog extends Animal {
        private static int dogCount = 0; // Статическое поле для подсчета количества созданных собак

        // Конструктор класса Dog
        public Dog() {
            dogCount++; // Увеличиваем счетчик собак при создании нового объекта
        }

        // Переопределение метода run для собаки
        @Override
        public void run(int distance) {
            if (distance <= 500) {
                System.out.println("Собака пробежала " + distance + " метров.");
            } else {
                System.out.println("Собака не может пробежать больше 500 метров.");
            }
        }

        // Переопределение метода swim для собаки
        @Override
        public void swim(int distance) {
            if (distance <= 10) {
                System.out.println("Собака проплыла " + distance + " метров.");
            } else {
                System.out.println("Собака не может проплыть больше 10 метров.");
            }
        }

        // Статический метод для получения общего количества собак
        public static int getDogCount() {
            return dogCount;
        }
    }

    // Класс Bowl (Миска)
     class Bowl {
        private int food; // Поле для хранения количества еды в миске

        // Конструктор класса Bowl
        public Bowl(int food) {
            this.food = food; // Изначально в миске указанное количество еды
        }

        // Метод для получения текущего количества еды
        public int getFood() {
            return food;
        }

        // Метод для уменьшения количества еды в миске
        public void decreaseFood(int amount) {
            if (food >= amount) {
                food -= amount; // Уменьшаем количество еды
            } else {
                System.out.println("В миске недостаточно еды.");
            }
        }

        // Метод для добавления еды в миску
        public void addFood(int amount) {
            food += amount; // Увеличиваем количество еды
        }
    }

    // Главный класс с методом main для тестирования кода
    class Main {
        public static void main(String[] args) {
            Cat[] cats = {new Cat(), new Cat(), new Cat()}; // Создаем массив из трех кошек
            Dog dog = new Dog(); // Создаем одну собаку

            Bowl bowl = new Bowl(20); // Создаем миску с 20 единицами еды

            // Кормим каждую кошку из массива
            for (Cat cat : cats) {
                cat.eat(bowl, 10); // Кошка ест 10 единиц еды
                System.out.println("Кошачья сытость: " + cat.isSatiety()); // Выводим информацию о сытости кошки
            }

            // Выводим оставшееся количество еды в миске
            System.out.println("Оставшееся еда в миске: " + bowl.getFood());

            // Тестируем поведение собаки
            dog.run(150); // Собака бегает на 150 метров
            dog.swim(8); // Собака плавает на 8 метров

            // Выводим общее количество созданных кошек и собак
            System.out.println("Общее количество созданных кошек: " + Cat.getCatCount());
            System.out.println("Общее количество созданных собак: " + Dog.getDogCount());
        }
    }

