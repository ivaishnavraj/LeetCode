int addDigits(int num) {
    if(num>=10)
    {
        return 1+(num-1)%9;
    }
    return num;
}