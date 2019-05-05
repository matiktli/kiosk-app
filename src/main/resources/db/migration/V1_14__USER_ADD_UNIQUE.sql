ALTER TABLE user
  ADD CONSTRAINT user_email_unique UNIQUE KEY(email);

ALTER TABLE user
  ADD CONSTRAINT user_student_number_unique UNIQUE KEY(student_number);