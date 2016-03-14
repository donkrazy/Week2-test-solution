package prob5;

public class MyStack implements Stack {
	private String[] buffer;
	private int capacity;
	private int top;
	
	public MyStack( int capacity ) {
		this.capacity = capacity;
		this.buffer = new String[ this.capacity ];
		this.top = 0;
		
		resizeBuffer();
	}
	
	private void resizeBuffer() {
		int capacity = this.capacity * 2;
		String[] tempBuffer = new String[ capacity ];
		if( buffer != null ) {
			System.arraycopy(buffer, 0, tempBuffer, 0, this.capacity );
		}
		buffer = tempBuffer;
		this.capacity = capacity;
	}
	
	@Override
	public void push(String str) {
		if( top == capacity ) {
			resizeBuffer();
		}
		buffer[top++] = str;
	}

	@Override
	public String pop() {
		if( top == 0 ) {
			return null;
		}
		return buffer[ --top ]; 
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {
		return top;
	}

}
