<%-- 
    Document   : index
    Created on : Mar 27, 2017, 12:47:37 PM
    Author     : edwin < edwinkun at gmail dot com >
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JWP pertemuan 02</title>
    </head>
    <body>
        <h1>Hari Ini Akan Belajar HTTP Body</h1>

        <div>
            <form method="GET" action="/JWP02/ActionServlet">
                <table>
                    <tr>
                        <td>Ini HTTP Request dengan method GET</td>
                    </tr>
                    <tr>
                        <td>Masukkan nama</td>
                        <td><input type="text" name="nama"></td>
                    </tr>
                    <tr>
                        <td>Masukkan alamat</td>
                        <td><input type="text" name="alamat"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="simpan"></td>
                    </tr>
                </table>
            </form>
        </div>

        <br />
        <br />
        <br />

        <div>
            <form method="POST" action="/JWP02/ActionServlet">
                <table>
                    <tr>
                        <td>Ini HTTP Request dengan method POST</td>
                    </tr>
                    <tr>
                        <td>Masukkan nama</td>
                        <td><input type="text" name="nama"></td>
                    </tr>
                    <tr>
                        <td>Masukkan alamat</td>
                        <td><input type="text" name="alamat"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="simpan"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
