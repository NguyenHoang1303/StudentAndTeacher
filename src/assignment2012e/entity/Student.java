package assignment2012e.entity;

public class Student {
    private String rollNumber;
    private String fullName;
    private String phone;
    private String email;

    public Student() {
    }

    public Student(String rollNumber, String fullName, String phone, String email) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("\n%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s |",
                "", rollNumber,"",
                "", fullName,"",
                "", email,"",
                "", phone,""
                            );
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
