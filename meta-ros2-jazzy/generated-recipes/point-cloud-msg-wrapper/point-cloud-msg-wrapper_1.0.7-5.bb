# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "A point cloud message wrapper that allows for simple and safe PointCloud2 msg usage"
AUTHOR = "Apex.AI, Inc. <opensource@apex.ai>"
ROS_AUTHOR = "Igor Bogoslavskyi <igor.bogoslavskyi@apex.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=80318c4afef111a7690eaf237460856b"

ROS_CN = "point_cloud_msg_wrapper"
ROS_BPN = "point_cloud_msg_wrapper"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = " \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/point_cloud_msg_wrapper-release/archive/release/jazzy/point_cloud_msg_wrapper/1.0.7-5.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/point_cloud_msg_wrapper"
SRC_URI = "git://github.com/ros2-gbp/point_cloud_msg_wrapper-release;${ROS_BRANCH};protocol=https"
SRCREV = "fb047463b9aa30d35af541c7fa4472b2f01c3b1b"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
