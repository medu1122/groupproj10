package phtb2;

public class QuyetPJ {

	public static void main(String[] args) {
		int[] numbers = {10, 5, 20, 15, 30};
        int max = numbers[0]; // Giả sử số đầu tiên là số lớn nhất
        
        // Duyệt qua từng phần tử của mảng để tìm số lớn nhất
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Cập nhật số lớn nhất nếu tìm thấy số lớn hơn
            }
        }
        
        System.out.println("Số lớn nhất trong mảng là: " + max);
	}

}
