public class SQLAzureDB extends ElasticDatabase implements Print {
    ElasticDatabase db;

    public SQLAzureDB(ElasticDatabase db) {
        this.db = db;
        super.print();
        print();
    }

    public void print() {
        System.out.println("SQL Azure Database implemented.");
    }
}
