<%!
	public boolean isArmstrong(int n){
		int s=0,n1=n;

		while(n!=0){
			int r = n%10;
			s+=r*r*r;
			n/=10;
		}

		return s==n1;
	}
%>