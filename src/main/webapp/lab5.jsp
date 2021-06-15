<%@page import="knu.fit.ist.ta.Lab5.Lab5_1"%>
<%@page import="knu.fit.ist.ta.Lab5.Lab5_2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
    </head>
    <body>
        <a href="index.jsp">Back to landing page</a>
        <%! Lab5_1 lab5_1 = new Lab5_1("Kyiv University or Shevchenko University or "
                + "officially the Taras Shevchenko National University of Kyiv"
                + " colloquially known as KNU is located in Kyiv, the capital of "
                + "Ukraine. The university is universally recognized as the most "
                + "prestigious university of Ukraine, being the largest national "
                + "higher education institution. KNU is ranked within top 650 universities"
                + " in the world. It is the third oldest university in Ukraine after"
                + " the University of Lviv and University of Kharkiv. Currently,"
                + " its structure consists of fifteen faculties (academic departments) "
                + "and five institutes. It was founded in 1834 by the Russian Tsar Nikolai I"
                + " as the Kiev Imperial University of Saint Vladimir, and since then it has"
                + " changed its name several times. During the Soviet Union era, Kiev State"
                + " University was one of the top-three universities in the USSR, along with "
                + "Moscow State University and Leningrad State University. It is ranked as the "
                + "best university in Ukraine in many rankings (see below). Throughout history,"
                + " the university has produced many famous alumni including Nikolay Bunge, "
                + "Mykhailo Drahomanov, Mykhailo Hrushevskyi, Nikolai Berdyaev, Mikhail Bulgakov,"
                + " Ivan Schmalhausen, Theodosius Dobzhansky, Viacheslav Chornovil, Leonid Kravchuk,"
                + " and many others. Taras Shevchenko himself, banned from educational activities"
                + " for political reasons, worked for the Kyiv University as a field researcher. Taras "
                + "Shevchenko University is renamed after Taras Shevchenko, a major figure in Ukrainian "
                + "literature and art. It is an institution of higher education that trains "
                + "specialists in many fields of knowledge and carries out research. It is considered "
                + "the most prestigious university in Ukraine and a major centre of advanced learning"
                + " and progressive thinking. It consists of more faculties and departments, and "
                + "trains specialists in a greater number of academic fields, than any other Ukrainian "
                + "educational institution. Nowadays, as it has done throughout its history, the University "
                + "retains its role of a major center of learning and research as well as an important "
                + "cultural center. Its academics and students follow the long-standing traditions of the"
                + " highest academic standards and democratic ideals. At present, the student body of Taras "
                + "Shevchenko University totals about <30,000 students; this number includes almost 2,000 "
                + "students at the Institute of International Relations which is attached to Taras"
                + " Shevchenko University. As training highly qualified specialists has always been the "
                + "main goal, the faculties and departments constantly revise their curricula and introduce "
                + "new programs. A number of faculties offer 4-year Bachelor's and 2-year master's degree"
                + " programs, together with traditional 5-year Specialist Degree programs. Currently, the "
                + "stress is on student's ability to work independently and meet employer's requirements, "
                + "thus practical experience in the field being of foremost importance. The curricula of"
                + " all Taras Shevchenko University faculties are based on the combination of academic "
                + "instruction with student's research work and the combination of thorough theoretical "
                + "knowledge with specific skills. Having acquired theoretical knowledge in the first "
                + "and the second year, in their third year undergraduates choose an area to specialize "
                + "in. At the same time they choose a field for their independent study, joining elective "
                + "special seminars; the results of research are usually presented at the meetings of "
                + "students' scientific societies or at scientific conferences, the most interesting "
                + "results are published.");%>
            <p><b>Text:</b> <%= lab5_1.GetText()%></p>
            <form action="./lab5" method="post" class="form-inline">
                <label for="x"><b>Enter word to search for: </b></label>
                <div class="input-group">
                    <input  class="form-control" id="find" type="text" name="find"/>
                    <input class="btn btn-success" type="submit" value="Submit"/>
                </div>
                <p class="mt-3 mb-0"><b>Word number: </b><%=request.getAttribute("result")%></p>
            </form>
            <p><b>Most popular words:</b> <%= lab5_1.GetMostPopularWords()%></p>
            <p><b>Most popular sequences (4):</b>
                <%= lab5_1.MostPopularSequences(4)%></p>
            <%! Lab5_2 lab5_2 = new Lab5_2(20); %>
            <% lab5_2.InitList(); %>
            <p><b>List: </b><br/> <%= lab5_2.DisplayList()%></p>
            <%! String find = "model #15"; %>
            <% lab5_2.SortByStringField();%>
            <p><b>Sorted by string field: </b><br/> <%= lab5_2.DisplayList()%></p>
            <p><b>Index of element with value </b><%= find %>: <%= lab5_2.IndexOf(find)%></p>
            <% lab5_2.SortByShortField();%>
            <p><b>Sorted by byte field: </b><br/> <%= lab5_2.DisplayList()%></p>
    </body>
</html>
