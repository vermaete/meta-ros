# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "URDF description for Universal Robots"
AUTHOR = "Felix Exner <exner@fzi.de>"
ROS_AUTHOR = "Nadia Hammoudeh Garcia"
HOMEPAGE = "https://github.com/UniversalRobots/Universal_Robots_ROS2_Description/issues"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD-3-Clause & Universal Robots A/S’ Terms and Conditions for Use of Graphical Documentation"
LICENSE = "BSD-3-Clause & Universal-Robots-A-S’-Terms-and-Conditions-for-Use-of-Graphical-Documentation"
LIC_FILES_CHKSUM = "file://package.xml;beginline=27;endline=27;md5=d0998f4eabe3d0099aca1e1f57f44fe6"

ROS_CN = "ur_description"
ROS_BPN = "ur_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-state-publisher-gui \
    launch \
    launch-ros \
    robot-state-publisher \
    rviz2 \
    urdf \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    launch-testing-ament-cmake \
    launch-testing-ros \
    urdfdom \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ur_description-release/archive/release/jazzy/ur_description/2.2.5-2.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/ur_description"
SRC_URI = "git://github.com/ros2-gbp/ur_description-release;${ROS_BRANCH};protocol=https"
SRCREV = "4bec3f46bf09ab41b41dc941730d084707443f84"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
