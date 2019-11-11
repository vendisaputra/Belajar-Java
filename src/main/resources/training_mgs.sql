/*
 Navicat Premium Data Transfer

 Source Server         : LOCAL
 Source Server Type    : MySQL
 Source Server Version : 100109
 Source Host           : localhost:3306
 Source Schema         : training_mgs

 Target Server Type    : MySQL
 Target Server Version : 100109
 File Encoding         : 65001

 Date: 05/11/2019 16:53:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (16);

-- ----------------------------
-- Table structure for tb_dosen
-- ----------------------------
DROP TABLE IF EXISTS `tb_dosen`;
CREATE TABLE `tb_dosen`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nip` varchar(24) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `dsn_nama` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `dsn_gender` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `dsn_status` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_dosen
-- ----------------------------
INSERT INTO `tb_dosen` VALUES (12, 'L200150084', 'Novendius Eka Saputra', 'Laki-laki', 'Tetap');
INSERT INTO `tb_dosen` VALUES (13, 'L200150083', 'Novendius Eka Saputra', 'Laki-laki', 'Tetap');

-- ----------------------------
-- Table structure for tb_khs
-- ----------------------------
DROP TABLE IF EXISTS `tb_khs`;
CREATE TABLE `tb_khs`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_mahasiswa` int(20) NOT NULL,
  `id_matkul` int(20) NULL DEFAULT NULL,
  `id_semester` int(255) NULL DEFAULT NULL,
  `khs_angka` double(255, 0) NULL DEFAULT NULL,
  `khs_huruf` varchar(3) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKavphwm5i98f4yywigu7wiq2cv`(`id_semester`) USING BTREE,
  INDEX `FKrq9hbhm1xhnakuw1ab9dfaa2i`(`id_mahasiswa`) USING BTREE,
  INDEX `FKrph2d77o20ay9swi94aj5pfju`(`id_matkul`) USING BTREE,
  CONSTRAINT `FKavphwm5i98f4yywigu7wiq2cv` FOREIGN KEY (`id_semester`) REFERENCES `tb_semester` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKrph2d77o20ay9swi94aj5pfju` FOREIGN KEY (`id_matkul`) REFERENCES `tb_matakuliah` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKrq9hbhm1xhnakuw1ab9dfaa2i` FOREIGN KEY (`id_mahasiswa`) REFERENCES `tb_mahasiswa` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_khs
-- ----------------------------
INSERT INTO `tb_khs` VALUES (1, 1, 15, 1, 4, 'A');

-- ----------------------------
-- Table structure for tb_mahasiswa
-- ----------------------------
DROP TABLE IF EXISTS `tb_mahasiswa`;
CREATE TABLE `tb_mahasiswa`  (
  `id` int(11) NOT NULL,
  `mhs_alamat` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `mhs_gender` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `mhs_nama` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `nim` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `mhs_tgllahir` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_mahasiswa
-- ----------------------------
INSERT INTO `tb_mahasiswa` VALUES (1, 'Sukoharjo', 'Laki-laki', 'Novendius Eka Saputra', 'L200150084', '1997-11-02');

-- ----------------------------
-- Table structure for tb_matakuliah
-- ----------------------------
DROP TABLE IF EXISTS `tb_matakuliah`;
CREATE TABLE `tb_matakuliah`  (
  `id` int(11) NOT NULL,
  `mtk_nama` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `mtk_kode` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `mtk_sks` int(3) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_matakuliah
-- ----------------------------
INSERT INTO `tb_matakuliah` VALUES (15, 'Pemrogramman Berorientasi Object', 'PBO', 3);

-- ----------------------------
-- Table structure for tb_semester
-- ----------------------------
DROP TABLE IF EXISTS `tb_semester`;
CREATE TABLE `tb_semester`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `semester` int(2) NULL DEFAULT NULL,
  `ket` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_semester
-- ----------------------------
INSERT INTO `tb_semester` VALUES (1, 1, 'Ganjil');

SET FOREIGN_KEY_CHECKS = 1;
