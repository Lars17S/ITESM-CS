package client;

import project.Project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Client implements InterfaceClient {
    Scanner sc = new Scanner(System.in);

    String name;
    String address;
    String phoneNumber;
    ArrayList<Project> projects;

    public Client(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void create() {
        String projectName;
        Calendar startDate = Calendar.getInstance();
        Integer durationDays;
        Integer day, month, year;
        System.out.println("Name project: ");
        projectName = sc.nextLine();
        System.out.println("Duration days: ");
        durationDays = sc.nextInt();
        System.out.println("Start date info\n");
        System.out.println("Day: ");
        day = sc.nextInt();
        System.out.println("Month: ");
        month = sc.nextInt();
        System.out.println("Year: ");
        year = sc.nextInt();
        startDate.set(year, month, day);
        projects.add(new Project(projectName, startDate, durationDays));
    }

    @Override
    public Project retrieve(String projectName) {
        return findProjectByName(projectName);
    }

    @Override
    public void update(String projectName) {
        Project project = findProjectByName(projectName);
        Integer option;
        if (project == null)
            return;
        System.out.println("Select an option to update\n (1) Project name | (2) Start Date | " +
                "(3) Duration days | (4) Analysis Stage | (5) Design Stage | " +
                "(6) Implementation Stage");
        System.out.println("Option: ");
        option = sc.nextInt();
        switch(option) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                System.out.println("Invalid option");
        }
    }

    @Override
    public void delete(String projectName) {
        if (projects.remove(findProjectByName(projectName)))
            System.out.println("Project removed");
        else System.out.println("Project not found");
    }

    private Project findProjectByName(String projectName) {
        Project project = null;
        for (Project pj : projects)
            if (pj.getName().compareTo(projectName) == 0) {
                project = pj;
                break;
            }
        return project;
    }
}
