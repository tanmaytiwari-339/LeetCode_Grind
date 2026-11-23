class ProductOfNumbers {
    List<Integer> list = new ArrayList<>();
    public ProductOfNumbers() {   
    }
    public void add(int num) {
        list.add(num);  
    }
    public int getProduct(int k) {
        int prod=1;
        int a=list.size();
        for(int i=a-k;i<a;i++){
            prod=prod*list.get(i);  
        }
        return prod;   
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */