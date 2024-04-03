#include <bits/stdc++.h>
using namespace std;



  
//#include <iostream>
//
//using namespace std;
//
//int A(int n) {
//  if (n <= 1) {
//    return n;
//  } else {
//    return 5 * A(n - 6) + A(n - 2);
//  }
//}
//
//int main() {
//  // Khai báo s? lu?ng ph?n t? c?n tính
//  int n = 4;
//
//  // In ra giá tr? a_n
//  for (int i = 0; i <= n; i++) {

//    cout << A(i) << " ";
//  }
//
//  return 0;
//}

int n;
int a(int n){
	if (n==0){
		return 1;
	}
	else if (n==1){
		return 3;
	}
	else {
		return 6*a(n-1)-9*a(n-2);
	}
}
int main (){
	cout<<"nhap n :";
	cin>>n;
	for (int i=0;i<=n;i++){
		cout<<a(i)<<" ";
	}
	return 0;
}
