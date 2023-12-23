int reverse(int x){
    long int r=0,s;
    if(x>0)
    s=1;
    else
    s=-1;
    x*=s;
    while(x>0){
        r=r*10+x%10;
        x/=10;
    }
    if(s*r <-pow(2,31) || s*r>pow(2,31)-1)
    return 0;
    else
    return s*r;


}