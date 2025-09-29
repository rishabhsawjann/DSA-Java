function getAverage(scores) {
    if (scores.length === 0) return 0; 
  
    let sum = 0;
    for (let i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    return sum / scores.length;
  }
  
  function getGrade(score) {
    if (score === 100) {
      return "A+";
    } else if (score >= 90 && score <= 99) {
      return "A";
    } else if (score >= 80 && score <= 89) {
      return "B";
    } else if (score >= 70 && score <= 79) {
      return "C";
    } else if (score >= 60 && score <= 69) {
      return "D";
    } else {
      return "F";
    }
  }
  
  function hasPassingGrade(score) {
    let grade = getGrade(score);
    return grade !== "F";
  }
  
  function studentMsg(scores, studentScore) {
    let average = getAverage(scores);
    let grade = getGrade(studentScore);
    let passed = hasPassingGrade(studentScore);
  
    if (passed) {
      return `Class average: ${average}. Your grade: ${grade}. You passed the course.`;
    } else {
      return `Class average: ${average}. Your grade: ${grade}. You failed the course.`;
    }
  }
  
  // ✅ Test cases
  console.log(getAverage([92, 88, 12, 77, 57, 100, 67, 38, 97, 89])); // 71.7
  console.log(getGrade(100)); // A+
  console.log(getGrade(85)); // B
  console.log(hasPassingGrade(50)); // false
  console.log(hasPassingGrade(90)); // true
  console.log(studentMsg([92, 88, 12, 77, 57, 100, 67, 38, 97, 89], 37));
  // "Class average: 71.7. Your grade: F. You failed the course."
  