
public class InvalidMarksException extends RuntimeException {
		String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public InvalidMarksException(String message) {
			super();
			this.message = message;
		}
		
		public InvalidMarksException() {
			message="The mark entered are not valid";
		}
		

		@Override
		public String toString() {
			return "InvalidMarksException [message=" + message + "]";
		}
		
}
