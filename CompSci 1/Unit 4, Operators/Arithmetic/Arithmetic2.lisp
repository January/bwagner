;; This is just like Arithmetic1, with num1 and num2 modified to 77 and 32 respectively, per instructions.
(setf num1 77)
(setf num2 32)

(setf sum (+ num1 num2))
(setf difference (- num1 num2))
(setf product (* num1 num2))
(setf quotient (/ num1 num2))
(setf remainder (mod num1 num2))

(write-line "        Arithmetic")
(write-line "============================")
(format t "~D + ~D = ~D~C" num1 num2 sum #\linefeed)
(format t "~D - ~D = ~D~C" num1 num2 difference #\linefeed)
(format t "~D * ~D = ~D~C" num1 num2 product #\linefeed)
(format t "~D / ~D = ~D~C" num1 num2 quotient #\linefeed)
(format t "~D % ~D = ~D~C" num1 num2 remainder #\linefeed)