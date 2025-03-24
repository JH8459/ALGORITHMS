/**
 * @param {number[]} seats
 * @param {number[]} students
 * @return {number}
 */
var minMovesToSeat = function(seats, students) {
    const sortedSeats = [...seats].sort((a, b) => a - b);
    const sortedStudents = [...students].sort((a, b) => a - b);

    return sortedSeats.reduce((sum, seat, idx) => {
        return sum + Math.abs(seat - sortedStudents[idx]);
    }, 0);
};