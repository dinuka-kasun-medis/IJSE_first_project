/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DinukaMedis
 */
public class UnderGraduateStudent {
    private String addmissionNo;
    private String addmissionDate;
    private String name;
    private String nic;
    private String dob;
    private String gender;
    private String email;
    private String address;
    private int phoneNo;
    private String alSubjects;
    private int alRank;
    private String facultyId;
    private String courseId;
    private String labId;
    private boolean fourthYearSelected;
    private int totalCredites;

    public UnderGraduateStudent(String addmissionNo, String addmissionDate, String name, String nic, String dob, String gender, String email, String address, int phoneNo, String alSubjects, int alRank, String facultyId, String courseId, String labId, boolean fourthYearSelected, int totalCredites) {
        this.addmissionNo = addmissionNo;
        this.addmissionDate = addmissionDate;
        this.name = name;
        this.nic = nic;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.alSubjects = alSubjects;
        this.alRank = alRank;
        this.facultyId = facultyId;
        this.courseId = courseId;
        this.labId = labId;
        this.fourthYearSelected = fourthYearSelected;
        this.totalCredites = totalCredites;
    }

    /**
     * @return the addmissionNo
     */
    public String getAddmissionNo() {
        return addmissionNo;
    }

    /**
     * @param addmissionNo the addmissionNo to set
     */
    public void setAddmissionNo(String addmissionNo) {
        this.addmissionNo = addmissionNo;
    }

    /**
     * @return the addmissionDate
     */
    public String getAddmissionDate() {
        return addmissionDate;
    }

    /**
     * @param addmissionDate the addmissionDate to set
     */
    public void setAddmissionDate(String addmissionDate) {
        this.addmissionDate = addmissionDate;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNo
     */
    public int getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the alSubjects
     */
    public String getAlSubjects() {
        return alSubjects;
    }

    /**
     * @param alSubjects the alSubjects to set
     */
    public void setAlSubjects(String alSubjects) {
        this.alSubjects = alSubjects;
    }

    /**
     * @return the alRank
     */
    public int getAlRank() {
        return alRank;
    }

    /**
     * @param alRank the alRank to set
     */
    public void setAlRank(int alRank) {
        this.alRank = alRank;
    }

    /**
     * @return the facultyId
     */
    public String getFacultyId() {
        return facultyId;
    }

    /**
     * @param facultyId the facultyId to set
     */
    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    /**
     * @return the courseId
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * @return the labId
     */
    public String getLabId() {
        return labId;
    }

    /**
     * @param labId the labId to set
     */
    public void setLabId(String labId) {
        this.labId = labId;
    }

    /**
     * @return the fourthYearSelected
     */
    public boolean isFourthYearSelected() {
        return fourthYearSelected;
    }

    /**
     * @param fourthYearSelected the fourthYearSelected to set
     */
    public void setFourthYearSelected(boolean fourthYearSelected) {
        this.fourthYearSelected = fourthYearSelected;
    }

    /**
     * @return the totalCredites
     */
    public int getTotalCredites() {
        return totalCredites;
    }

    /**
     * @param totalCredites the totalCredites to set
     */
    public void setTotalCredites(int totalCredites) {
        this.totalCredites = totalCredites;
    }

}
