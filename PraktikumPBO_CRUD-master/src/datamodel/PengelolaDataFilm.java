/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamodel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PengelolaDataFilm implements InterfaceCRUD<DataFilm> {
    private Connection conn;

    public PengelolaDataFilm() {
        conn = KoneksiDatabase.connect();
    }

    @Override
    public void create(DataFilm movie) {
        String sql = "INSERT INTO movie (judul, alur, penokohan, akting, rating) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, movie.getJudul());
            stmt.setDouble(2, movie.getAlur());
            stmt.setDouble(3, movie.getPenokohan());
            stmt.setDouble(4, movie.getAkting());
            stmt.setDouble(5, movie.getRating());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<DataFilm> readAll() {
        List<DataFilm> list = new ArrayList<>();
        String sql = "SELECT * FROM movie";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                DataFilm m = new DataFilm(
                    rs.getInt("id"),
                    rs.getString("judul"),
                    rs.getDouble("alur"),
                    rs.getDouble("penokohan"),
                    rs.getDouble("akting")
                );
                list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void update(DataFilm movie) {
        String sql = "UPDATE movie SET judul=?, alur=?, penokohan=?, akting=?, rating=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, movie.getJudul());
            stmt.setDouble(2, movie.getAlur());
            stmt.setDouble(3, movie.getPenokohan());
            stmt.setDouble(4, movie.getAkting());
            stmt.setDouble(5, movie.getRating());
            stmt.setInt(6, movie.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM movie WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
