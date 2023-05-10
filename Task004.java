package HWClass19;

public class Task004 {
    private void printInfo(String name) {
            System.out.println(name);
        }

        private void printInfo(String name, int age) {
            System.out.println(name + " " + age);
        }

        private void printInfo(String name, int age, double grade) {
            System.out.println(name + " " + age + " " + grade);
        }
        public static void main(String[] args) {
            Task004 overload = new Task004();
            overload.printInfo("Yaya");
            overload.printInfo("Yaya", 45);
            overload.printInfo("Yaya", 45, 99.9);
        }


    }

