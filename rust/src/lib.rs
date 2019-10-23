fn double_the_number(input: i32) -> i32 {
    return input * 2;
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn function_doubles_the_input() {
        assert_eq!(4, double_the_number(2));
    }
}
