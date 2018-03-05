package tydzien4.niedziela.optional;

import java.util.Optional;

public class Zadanie25 {
	public <T> boolean checkIfNull(T value) {
	    return Optional.ofNullable(value).isPresent();
//	    if(value == null)
//		{
//			return false;
//		}
//		else
//		{
//			return true;
//		}
	}

	public <T> void printValue(T value) {
		Optional.ofNullable(value).ifPresent(message -> System.out.println(message));
//		if (value != null)
//		{
//			System.out.println(value);
//		}
	}

	public String checkValue(String valueToCheck) {
		return Optional.ofNullable(valueToCheck).orElse("n/a");
//		if (valueToCheck == null)
//		{
//			return "n/a";
//		}

	}

	public <T> T throwExceptionWhenNull(T value) {
		return Optional.ofNullable(value).orElseThrow(()-> new IllegalArgumentException("Remember, please do not provide null value!"));
//		if(value == null)
//		{
//			throw new IllegalArgumentException("Remember, please do not provide null value!");
//		}
//		return value;
	}

	public <T> Optional returnOptional(T value) {
		return Optional.of(value);
	}

	public <T> Optional returnOptionalIfNotEmpty(T value) {
		return Optional.ofNullable(value);
	}

	public Boolean checkIfCarMatchThePrice(Car car, Double min, Double max) {
		return Optional.ofNullable(car)
				.filter(c -> c.getPrice() > min)
				.filter(c -> c.getPrice() < max)
				.isPresent();
	}
}
