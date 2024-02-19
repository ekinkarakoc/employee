public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary < 1000){
            System.out.println("vergi yok");
            return 0;

        }else{
            System.out.println("verginiz: " + (this.salary*3)/100 );
            return (this.salary*3)/100;
        }
    }

    double bonus(){
        if (workHours >40){
            System.out.println("Ekstra Maaşınız: " + (workHours-40) * 30 );
            return (workHours-40) * 30;
        }else{
            System.out.println("40 saatten az çalıştınız");
            return 0;
        }
    }

    double raiseSalary(){
        if (2021-hireYear <10){
            System.out.println("10 yıldan az çalışan maaşı: " + (salary*105)/100);
            return (salary*105)/100;
        }else if(9< 2021-hireYear && 20> 2021-hireYear){

            System.out.println("9-20 yıl arası çalışan maaşı:" + (salary*110)/100);
            return (salary*110)/100;
        }else {
            return (salary*115)/100;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
