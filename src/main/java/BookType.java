public enum BookType {
    Horror("This book is a horror.");


    // think this is making a string to assign to a value that cannot be changed???
    private final String value;
    BookType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}


