/*liste des candidats   admis et non admis */
select nom_candidat, points from candidat inner join moyenne on moyenne.id_candidat= candidat.id_candidat where moyenne.points < 10;
select nom_candidat, points from candidat inner join moyenne on moyenne.id_candidat= candidat.id_candidat where moyenne.points >10;


