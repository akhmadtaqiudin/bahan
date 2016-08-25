public class Server {
  private int id;
  private String servername;
  private String ip;
  private int port;
  private String username;
  private String password;

  public Server() {
  }

  public Server(String name, String ip, int port, String username, String password) {
    this.servername = name;
    this.ip = ip;
    this.port = port;
    this.username = username;
    this.password = password;
  }

  public void setId(int i) {
    id = i;
  }

  public int getId() {
    return id;
  }

  public void setServername(String s) {
    servername = s;
  }

  public String getServername() {
    return servername;
  }

  public void setIp(String s) {
    ip = s;
  }

  public String getIp() {
    return ip;
  }

  public void setPort(int i) {
    port = i;
  }

  public int getPort() {
    return port;
  }

  public void setUsername(String s) {
    username = s;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String s) {
    password = s;
  }

  public String getPassword() {
    return password;
  }
}