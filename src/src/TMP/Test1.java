package src.TMP;


public class Test1 {



        public static class Cat {

            public static int count;

            private String name;

            public Cat(String name) {
                this.name = name;
            }

            public Cat() {
            }

            public static void main(String[] args) throws Throwable {

                for (int i = 0; i < 1000000; i++) {

                    Cat cat = new Cat();
                    cat = null;//вот здесь первый объект становится доступен сборщику мусора
                }
                System.out.println(count);
            }

            @Override
            protected void finalize() throws Throwable {
                count++;
                //System.out.println("Объект Cat уничтожен!");
            }
        }
}
