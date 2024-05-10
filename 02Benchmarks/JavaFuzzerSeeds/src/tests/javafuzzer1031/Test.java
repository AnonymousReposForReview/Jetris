package tests.javafuzzer1031;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:56:14 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-196L;
    public static double dFld=-2.112898;
    public static int iFld=141;
    public short sFld=10292;
    public static float fFld=1.278F;
    public int iFld1=250;
    public int iArrFld[]=new int[N];
    public static long lArrFld[][]=new long[N][N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 9L);
        FuzzerUtils.init(Test.iArrFld1, 11);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, int i4) {

        int i5=198, i6=-7, i7=8, i8=13, i9=220, iArr[]=new int[N];
        float f=-1.797F;
        short s=-15403;
        boolean b=false;

        FuzzerUtils.init(iArr, -1);

        for (i5 = 3; i5 < 171; ++i5) {
            if (b) {
                i7 = 1;
                while (++i7 < 9) {
                    i4 -= (int)Test.instanceCount;
                    i3 += 19503;
                    for (i8 = 1; 1 > i8; ++i8) {
                        i3 += (i8 * f);
                        i6 += (int)Test.dFld;
                        i9 >>>= i8;
                        i9 = (int)Test.instanceCount;
                        iArr[i7] = (int)Test.instanceCount;
                        f += i8;
                        Test.iFld -= i9;
                        i9 &= s;
                        i4 *= (int)Test.instanceCount;
                    }
                }
            } else {
                Test.instanceCount += Test.instanceCount;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f) + s + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr);
    }

    public int iMeth(int i2, double d) {

        int i10=-9, i11=125, iArr1[]=new int[N], iArr2[][]=new int[N][N];
        float f1=18.941F;
        boolean b1=true;
        byte by1=34;

        FuzzerUtils.init(iArr1, 48);
        FuzzerUtils.init(iArr2, 103);

        vMeth1(Test.iFld, Test.iFld);
        for (i10 = 10; i10 < 346; i10++) {
            if (Test.iFld != 0) {
            }
            i2 /= 47362;
            f1 = i10;
            iArr1[i10 + 1] += (int)Test.dFld;
            if (b1) continue;
            switch ((i10 % 7) + 88) {
            case 88:
                iArr2 = iArr2;
                sFld <<= (short)i11;
                i11 &= (int)Test.instanceCount;
            case 89:
                by1 |= (byte)-49429;
                i2 ^= Test.iFld;
                break;
            case 90:
                iArr1[i10] -= (int)-253L;
                break;
            case 91:
                i11 = i10;
                break;
            case 92:
                if (b1) continue;
            case 93:
                f1 += (i10 - Test.iFld);
            case 94:
                i2 &= -27196;
                break;
            default:
                Test.instanceCount += i2;
            }
        }
        long meth_res = i2 + Double.doubleToLongBits(d) + i10 + i11 + Float.floatToIntBits(f1) + (b1 ? 1 : 0) + by1 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i=4, i1=0, i12=63154, i13=6, i14=63492, i15=107, i16=-8434;
        byte by=33;

        for (i = 221; i > 10; i--) {
            boolean b2=true;
            if (((++by) + (iMeth(i1, Test.dFld) + Test.iFld)) != 62034) break;
            Test.instanceCount -= Test.instanceCount;
            iArrFld = iArrFld;
            if (b2) continue;
            i1 = -898;
            if (Test.iFld != 0) {
                vMeth_check_sum += i + i1 + by + i12 + i13 + i14 + i15 + i16;
                return;
            }
            Test.instanceCount = i;
            Test.fFld += i1;
        }
        for (i12 = 14; i12 < 243; ++i12) {
            by += (byte)(i12 * i);
            for (i14 = 1; 7 > i14; i14 += 3) {
                i16 = 1;
                while (++i16 < 4) {
                    Test.iFld ^= i14;
                }
                Test.dFld = i13;
            }
        }
        vMeth_check_sum += i + i1 + by + i12 + i13 + i14 + i15 + i16;
    }

    public void mainTest(String[] strArr1) {

        int i17=-170, i18=-70, i19=-174, i20=-31351, i21=-7, i22=-34923, i23=36158, i24=-49542, i25=-47230, i26=118,
            i27=24162;
        byte by2=5;
        double d1=-54.10644;
        boolean b3=false;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, -63.182F);

        vMeth();
        for (i17 = 2; i17 < 197; i17++) {
            for (i19 = i17; 129 > i19; ++i19) {
                Test.iFld -= by2;
            }
            Test.lArrFld[i17][i17] = Test.iFld;
            for (i21 = 7; i21 < 129; i21++) {
                switch ((i17 % 7) + 101) {
                case 101:
                    for (d1 = 1; d1 < 2; d1++) {
                        Test.instanceCount |= i22;
                        i23 += (int)(((d1 * i22) + i20) - i17);
                        i22 += (int)d1;
                        Test.instanceCount -= Test.instanceCount;
                        i23 = i18;
                    }
                    break;
                case 102:
                    sFld *= (short)i23;
                case 103:
                case 104:
                    i20 += (int)-109.113F;
                    iFld1 = (int)-29175L;
                    Test.iFld += -13;
                    break;
                case 105:
                case 106:
                    fArr[i17 - 1][i21] *= 56285;
                case 107:
                    for (i24 = 2; i24 > 1; i24--) {
                        Test.instanceCount >>= iFld1;
                        if (b3) continue;
                        fArr[i24][i17] += Test.instanceCount;
                    }
                    for (i26 = 1; i26 < 2; i26++) {
                        Test.instanceCount += (long)(1.152F + (i26 * i26));
                        switch (((i17 % 3) * 5) + 11) {
                        case 16:
                            if (b3) continue;
                            Test.iArrFld1[i26 - 1] -= i17;
                            break;
                        case 18:
                            Test.instanceCount = by2;
                            iArrFld[i21 - 1] -= 111;
                            iArrFld[i21 - 1] = (int)Test.instanceCount;
                            break;
                        case 21:
                            iFld1 -= i26;
                            break;
                        default:
                            Test.iFld += i26;
                        }
                    }
                    break;
                default:
                    Test.fFld = i21;
                }
            }
        }

    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}