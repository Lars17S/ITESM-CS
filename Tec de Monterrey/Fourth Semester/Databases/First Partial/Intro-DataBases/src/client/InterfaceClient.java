package client;

import project.Project;

interface InterfaceClient {
    public void create();
    public Project retrieve(String projectName);
    public void update(String projectName);
    public void delete(String projectName);
}
