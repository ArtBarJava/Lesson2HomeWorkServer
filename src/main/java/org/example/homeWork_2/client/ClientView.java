package org.example.homeWork_2.client;

public interface ClientView {
    void showMessage(String Message);
    void disconnectFromServer();
    void showHeaderPanel(boolean visible);
    void setLog(String log);
    String getClientName();
}
