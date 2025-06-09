class a {
    int d;

    public void setNum(int a)
    {
        d = a;
    }
    public int getNum(){
        return d;
    }
    public static void main(String[] args) {
        a A = new a();
        A.setNum(5);
        System.out.println(A.getNum());

    }

}
