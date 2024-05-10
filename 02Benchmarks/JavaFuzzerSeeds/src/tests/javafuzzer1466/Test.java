package tests.javafuzzer1466;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:11:18 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=12L;
    public static short sFld=6511;
    public volatile double dFld=-6.26490;
    public int iFld=-19487;
    public static float fFld=1.780F;
    public boolean bFld=false;
    public byte byArrFld[]=new byte[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i6) {

        float f=0.896F;
        int i7=0, i8=-6, iArr3[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr3, 2);

        Test.instanceCount >>>= i6;
        for (f = 4; 276 > f; ++f) {
            Test.fFld = 2.477F;
            Test.instanceCount = i7;
            i6 -= i6;
            i8 = 1;
            do {
                iArr3[i8 - 1] *= i6;
                i6 ^= i8;
                Test.sFld *= Test.sFld;
                b = b;
                if (false) continue;
                Test.instanceCount >>>= i7;
            } while (++i8 < 6);
            i7 = (int)f;
            Test.instanceCount >>= Test.instanceCount;
        }
        b = b;
        long meth_res = i6 + Float.floatToIntBits(f) + i7 + i8 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr3);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth1(long l) {

        long l1=-13679L;
        int i4=140, i5=-8120, i9=4, i10=26226, iArr2[]=new int[N];
        double d=-85.84774;
        byte by=81;

        FuzzerUtils.init(iArr2, 25516);

        for (l1 = 4; 274 > l1; l1++) {
            iFld = (int)(((i4 / (iFld | 1)) - (l += i4)) / (((long)(i4 + (l - Test.fFld))) | 1));
            for (d = 1; d < 6; d += 3) {
                Test.instanceCount += (((iArr2[(int)(d + 1)]++) * (-(l1 * 20623))) + (lMeth(i4) - 7023));
                switch ((int)(((d % 9) * 5) + 79)) {
                case 106:
                    i5 = i5;
                    i4 = (int)l;
                    for (i9 = 1; i9 < 6; i9++) {
                        i10 = by;
                        i4 -= (int)Test.fFld;
                        iArr2[(int)(l1)] += (int)dFld;
                        Test.instanceCount = -8;
                        i4 -= 36151;
                        byArrFld[(int)(d - 1)] = (byte)iFld;
                        i4 = i10;
                    }
                    break;
                case 96:
                    Test.instanceCount = i4;
                    break;
                case 122:
                    Test.instanceCount *= i4;
                    break;
                case 123:
                    if (true) break;
                    break;
                case 105:
                    if (bFld) continue;
                    break;
                case 112:
                    iArr2[(int)(d)] <<= i10;
                    break;
                case 101:
                    iArr2[(int)(l1 + 1)] *= (int)Test.instanceCount;
                    break;
                case 114:
                    dFld += i9;
                case 84:
                    Test.fFld = i10;
                    break;
                }
            }
        }
        vMeth1_check_sum += l + l1 + i4 + Double.doubleToLongBits(d) + i5 + i9 + i10 + by + FuzzerUtils.checkSum(iArr2);
    }

    public void vMeth() {

        int i1=-241, i2=-23182, i11=15807, i12=14, i13=0, i14=-13980, iArr1[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr1, -216);
        FuzzerUtils.init(sArr, (short)13094);

        switch ((((((int)(iFld + 15067L)) >>> 1) % 2) * 5) + 77) {
        case 85:
            for (i1 = 15; i1 < 270; ++i1) {
                vMeth1(Test.instanceCount);
                if (bFld) {
                    for (i11 = 6; i11 > i1; i11 -= 3) {
                        for (i13 = 1; i13 < 1; ++i13) {
                            Test.fFld = 56606;
                            iFld *= (int)Test.fFld;
                            if (i14 != 0) {
                                vMeth_check_sum += i1 + i2 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1) +
                                    FuzzerUtils.checkSum(sArr);
                                return;
                            }
                            Test.instanceCount = -54;
                        }
                        dFld /= (Test.instanceCount | 1);
                        Test.instanceCount += -45268;
                        iFld = (int)Test.instanceCount;
                        i2 += (i11 + i12);
                        i2 *= (int)Test.fFld;
                    }
                } else if (bFld) {
                    sArr[i1 - 1] += (short)i14;
                } else if (bFld) {
                    iFld += (i1 ^ i12);
                    vMeth_check_sum += i1 + i2 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1) +
                        FuzzerUtils.checkSum(sArr);
                    return;
                }
            }
            break;
        case 83:
            Test.instanceCount = iFld;
            break;
        default:
            iArr1[(i1 >>> 1) % N] = i2;
        }
        vMeth_check_sum += i1 + i2 + i11 + i12 + i13 + i14 + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(sArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-246, i15=-37441, i16=-47, i17=50791, i18=8, i19=14, i20=-46300, i21=-9, i22=-14, iArr[]=new int[N];
        double d1=2.69249;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -51371);
        FuzzerUtils.init(lArr, 4L);

        iArr[(i >>> 1) % N] = (int)((Test.sFld * (-5 + (++i))) * (dFld + i));
        vMeth();
        for (i15 = 206; i15 > 5; i15--) {
            i16 *= i;
            Test.fFld -= iFld;
            iArr[i15] = (int)3360234015L;
            if (bFld) break;
        }
        if (bFld) {
            i = (int)dFld;
            iFld = i16;
            for (d1 = 10; d1 < 161; d1++) {
                Test.instanceCount *= i15;
                for (i18 = 1; i18 < 166; ++i18) {
                    i <<= i17;
                }
                lArr[(int)(d1 - 1)] = i;
                Test.fFld = i17;
                Test.fFld = i15;
                i20 = 1;
                while (++i20 < 166) {
                    Test.instanceCount = i;
                    i17 = i16;
                    i = i20;
                }
                iFld += i18;
                i17 *= iFld;
            }
            i21 = 1;
            while (++i21 < 155) {
                i16 -= i20;
                i22 = 1;
                do {
                    i19 %= (int)(iFld | 1);
                    i19 += (i22 - Test.instanceCount);
                    Test.fFld += i22;
                } while (++i22 < 162);
            }
        } else if (bFld) {
            Test.instanceCount = Test.instanceCount;
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
