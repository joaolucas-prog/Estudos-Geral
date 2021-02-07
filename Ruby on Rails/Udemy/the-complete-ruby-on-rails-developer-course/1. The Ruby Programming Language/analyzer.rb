puts "Enter your first name"
first_name = gets.chomp
puts "Enter your last_name"
last_name = gets.chomp
full_name = first_name + " " + last_name
puts "Your full name is #{full_name}"
puts "Your full name reversed is #{full_name.reverse}"
puts "Your name has #{(full_name.size) -1} characters in it" 