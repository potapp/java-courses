/** класс реализует калькулятор */

public class Calculator {
		/**результат вычислений*/
		private int result;
		
		/**Суммируем аргументы.
			@param и params аргументы суммирования*/
		public void add (int ... params) {
			for (Integer param : params) {
				this.result += param;
			}
		}
		
		/**Получить результат.
			@return результат вычисления.*/
		public int getResult () {
			return this.result;
		}
		
		/**Очистить результат вычисления. */
		public void cleanResult () {
			this.result = 0;
		}
}