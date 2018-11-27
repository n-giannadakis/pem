/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workmodel;

/**
 *
 * @author user
 */
public class Workmodel {
    
    public class person{
    
        private String Name;
        private String Surname;
        private int age;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getSurname() {
            return Surname;
        }

        public void setSurname(String Surname) {
            this.Surname = Surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        
        public class employee{
        
            private double wage;

            public double getWage() {
                return wage;
            }

            public void setWage(double wage) {
                this.wage = wage;
            }
        }
        
        public class Manager{
        
            private double bonus;

            public double getBonus() {
                return bonus;
            }

            public void setBonus(double bonus) {
                this.bonus = bonus;
            }
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
