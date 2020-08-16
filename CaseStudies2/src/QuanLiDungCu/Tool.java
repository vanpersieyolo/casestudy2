package QuanLiDungCu;

public class Tool {
    String nameTool;
    int IDManagement;
    int numberTool;
    int idTool;

    public int getIdTool() {
        return idTool;
    }

    public void setIdTool(int idTool) {
        this.idTool = idTool;
    }

    public Tool() {
    }

    public Tool(String nameTool, int IDManagement, int numberTool) {
        this.nameTool = nameTool;
        this.IDManagement = IDManagement;
        this.numberTool = numberTool;
    }

    public String getNameTool() {
        return nameTool;
    }

    public void setNameTool(String nameTool) {
        this.nameTool = nameTool;
    }

    public int getIDManagement() {
        return IDManagement;
    }

    public void setIDManagement(int IDManagement) {
        this.IDManagement = IDManagement;
    }

    public int getNumberTool() {
        return numberTool;
    }

    public void setNumberTool(int numberTool) {
        this.numberTool = numberTool;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "Tên dụng cụ: '" + nameTool + '\'' +
                ", Tên người quản lí dụng cụ: " + IDManagement +
                ", Số lượng dụng cụ: " + numberTool +
                ", Id dụng cụ =" + idTool +
                '}';
    }
}
